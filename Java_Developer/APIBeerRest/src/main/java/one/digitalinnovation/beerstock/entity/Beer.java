package one.digitalinnovation.beerstock.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.beerstock.enums.BeerType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity // descreve a entidade para mapeamento
@NoArgsConstructor
@AllArgsConstructor
public class Beer { //mapeando unica unidade

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true) //nunca pode ser nula
    private String name; // cadastro de uma unica cerveja

    @Column(nullable = false)
    private String brand; // marca da cerveja varias

    @Column(nullable = false)
    private int max; // numero maximo de cervejas cadastrados

    @Column(nullable = false)
    private int quantity; // quantidade de cerveja (menor igual ao maximo da cerveja)

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BeerType type; // tipo da cerveja


}
