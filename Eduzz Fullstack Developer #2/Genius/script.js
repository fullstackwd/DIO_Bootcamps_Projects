let order = [];
let clickedOrder = [];
let score = 0;
//0 = verde
//1 = vermelho
//2 = amarelo
//3 = azul

const azul = document.querySelector('.azul');
const vermelho = document.querySelector('.vermelho');
const verde = document.querySelector('.verde');
const amarelo = document.querySelector('.amarelo');

//Cria ordem aleatória de cores

let shuffleOrder = () =>{
    let colorOrder = Math.floor(Math.random() * 4);
    order[order.length] = colorOrder;
    clickedOrder = [];

    for(let i in order){
        let elementColor = createColorElement(order[i]);
        lightColor(elementColor, Number(i) + 1);
    }
}

//Acende a próxima cor

let lightColor = (element, number)=>{
    number = number * 500;
    setTimeout(() =>{
        element.classList.add('selected');
    }, number - 250); 
    setTimeout(()=>{
        element.classList.remove('selected');
    });
}

//Checa se o bostões clickados são os mesmos apresentados no jogo

let checkOrder = () => {
    for(let i in clickedOrder){
        if(clickedOrder[i]!= order[i]){
            gameOver();
            break;
        }
    } 
    if(clickedOrder.length == order.length){
        alert(`Pontuação ${score}\n Você acertou!\n Iniciando o próximo nível!`);
        nextLevel();
    }   
}

//Função para click do usuário

let Click = (color)=>{
    clickedOrder[clickedOrder.length] = color;
    createColorElement(color).classList.add('selected');

    setTimeout(() => {
        createColorElement(color).classList.remove('selected');
        checkOrder();
    },250);
    
}

//Função que retorna a cor

let createColorElement = (color) =>{
    if(color == 0){
        return verde;
    }else if(color == 1){
        return vermelho;
    }else if(color == 2){
        return amarelo;
    }else if(color == 3){
        return azul;
    }
}

//Função que retorna o próximo nível do jogo

let nextLevel=()=> {
    score ++;
    shuffleOrder();
}

//Função game OVER !!

let gameOver =() =>{
    alert(`Pontuação ${score}!\n Você Perdeu hahahah!\n Click em OK para Iniciar um novo jogo!`);
    order = [];
    clickedOrder = [];

    playGame();
}

// Função para iniciar o jogo

let playGame = () => {
    alert ("Bem vindo!\n Iniciando Novo Jogo...");
    score = 0;

    nextLevel();
}

//Eventos de click do jogo

verde.onclick = () => Click(0);
vermelho.onclick = () => Click(1);
amarelo.onclick = () => Click(2);
azul.onclick = () => Click(3);

//inicio do jogo

playGame();