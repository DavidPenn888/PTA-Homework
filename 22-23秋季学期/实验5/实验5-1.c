int GetHeight( BinTree BT)
{
    int m,n;
    if(BT==NULL)
    return 0;
    else
    {
    m=GetHeight(BT->Left);
    n=GetHeight(BT->Right);
    if (m>n)
    return(m+1);
    else
    return(n+1);
    }
}
