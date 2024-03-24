#include <stdio.h>

float soma(float num1,float num2){
    return num1+num2;
}
float subtrai(float num1,float num2){
    return num1-num2;
}
float multiplica(float num1,float num2){
    return num1*num2;
}
float divide(float num1,float num2){
    return num1/num2;
}
void apresenta(float resultado){
    printf("Resultado: %.2f\n",resultado);
}
int main(){
    char operador;
    float num1,num2;
    printf("Digite a operação (+,-,*,/): ");
    scanf("%c",&operador);

    printf("Digite o 1a numero");
    scanf("%f",&num1);

    printf("Digite o 2a numero");
    scanf("%f",&num2);

    switch (operador){
        case '+':
            apresenta(soma(num1,num2));
            break;
        case '-':
            apresenta(subtrai(num1,num2));
            break;
        case '*':
            apresenta(multiplica(num1,num2));
            break;
        case '/':
            if(num2 != 0 ){
                apresenta(divide(num1,num2));
            }else{
                printf("Erro divisão por zero.\n");
            }
            break;
        default:
            printf("Operador invalido.\n");
    }
    return 0;
}
