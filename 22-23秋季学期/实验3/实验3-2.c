Stack CreateStack(int MaxSize)
{
    Stack S;
    //开辟一个结构体的空间
    S = (Stack)malloc(sizeof(struct SNode));
    //开辟数组空间
    S->Data = (ElementType *)malloc(sizeof(ElementType)*MaxSize);
    S->MaxSize = MaxSize;
    //第一个栈的top
    S->Top1=-1;
    //第二个栈的top
    S->Top2=MaxSize;
    return S;
}

bool Push( Stack S, ElementType X, int Tag )
{
    //当两个栈的Top相邻时，堆栈已满
    if((S->Top2-S->Top1)==1)
    {
        printf("Stack Full\n");
        return false;
    }
    if(Tag==1)
    {
        S->Data[++S->Top1]=X;
    }else
    {
        S->Data[--S->Top2]=X;
    }
    return true;
}

ElementType Pop( Stack S, int Tag )
{
    ElementType ans;
    if(Tag==1)
    {
        //堆栈1为空时
        if(S->Top1==-1)
        {
            printf("Stack %d Empty\n",Tag);
            return ERROR;
        }else
        {
            ans=S->Data[S->Top1];
            S->Top1--;
        }
    }else
    {
        if(S->Top2==S->MaxSize)
        {
            //堆栈2为空时
            printf("Stack %d Empty\n",Tag);
            return ERROR;
        }else
        {
            ans=S->Data[S->Top2];
            S->Top2++;
        }
    }
    return ans;
}

