Status SPush( SqStack &s,ElemType x)
{
    if(s.top==s.stacksize)
        return ERROR;
    else{
        s.data[s.top++]=x;
        return OK;
    }
}
Status SPop( SqStack &s,int &e )
{
    if(s.top==0)
        return ERROR;
    s.top--;
    e = s.data[s.top];
    return OK;
}
