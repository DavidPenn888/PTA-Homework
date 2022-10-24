int Length( List L )
{
    if(L == NULL){
        return 0;
    }
    int i = 0;
    while(L){
        L = L->Next;
        i++;
    }
    return i;
}