#include<stdio.h>
main(){
    printf("main");

    int total =  add(3,5);
    printf("total: %d\n", total);

}
add(int a, int b){
    return a + b;
}
