provider "google" {
  project = "alef_gcp-iac"
  region  = "us-central1"
  zone    = "us-central1-c"
  credentials = "${file("serviceaccount.yaml")}"
}

resource "google_folder" "Financeiro" {
  display_name = "Financeiro"
  parent       = "organizations/xxxxxxxxxxxx"
}

resource "google_folder" "SalesForce" {
  display_name = "SalesForce"
  parent       = google_folder.Financeiro.name
}

resource "google_folder" "Desenvolvimento" {
  display_name = "Desenvolvimento"
  parent       = google_folder.SalesForce.name
}

resource "google_folder" "Producao" {
  display_name = "Producao"
  parent       = google_folder.SalesForce.name
}


resource "google_project" "alef-salesforce-dev" {
  name       = "SalesForce-Dev"
  project_id = "alef-salesforce-dev"
  folder_id  = google_folder.Desenvolvimento.name
  auto_create_network=false
  billing_account = "xxxxxx-xxxxxx-xxxxxx"

}

# resource "google_project" "alef-salesforce-prod" {
#   name       = "SalesForce-Prod"
#   project_id = "alef-salesforce-prod"
#   folder_id  = google_folder.Producao.name
#   auto_create_network=false
#   billing_account = "xxxxxx-xxxxxx-xxxxxx"
# }