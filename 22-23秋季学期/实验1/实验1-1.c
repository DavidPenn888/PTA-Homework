List MakeEmpty()
{
    List L=(List)malloc(MAXSIZE * sizeof(struct LNode));
    L->Last=-1;
    return L;
}
 
Position Find( List L, ElementType X )
{
    Position p = -1;
    for(int i = 0;i <= L -> Last; i++)
    {
        if(X == L -> Data[i]) p = i;
    }
    if(p == -1)return ERROR;
    else return p;
}
 
bool Insert( List L, ElementType X, Position P )
{
    if(L->Last>=MAXSIZE-1)
    {
        printf("FULL");
        return false;
    }
    if(P<0 || P>L -> Last+1)
    {
        printf("ILLEGAL POSITION");
        return false;
    }
    
    for(int i = L -> Last + 1;i > P;i--) L->Data[i]=L->Data[i-1];
    L->Data[P]=X;
    L->Last++;
    return true;
}
 
bool Delete( List L, Position P )
{
    if(P<0||P>L->Last)
    {
        printf("POSITION %d EMPTY",P);
        return false;
    }
    
    for(int i=P;i<L->Last;i++)
    {
        L->Data[i]=L->Data[i+1];
    }
    L->Last--;
    return true;
}
