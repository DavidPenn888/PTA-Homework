bool Push( Stack S, ElementType X ){
if(S->Top>=S->MaxSize){
    printf("Stack Full\n");
    return false;
    }
    else {
        S->Data[S->Top]=X;
        S->Top++;
        return true;
    }
}
ElementType Pop( Stack S ){
    ElementType data=ERROR;
if(S->Top<=0)
        printf("Stack Empty\n");
else{
    data=S->Data[S->Top-1];
    S->Top--;
}
return data;
}
