Position Find(List L, ElementType X)
{
    while(L)
    {
        if (L->Data == X)
            return L;
        L = L->Next;
    }
    return ERROR;
}

List Insert(List L, ElementType X, Position P)
{
    List m = (List)malloc(sizeof(List));
    m->Next = NULL;
    m->Data = X;
    List head = L;

    if (P == L)
    {
        m->Next = L;
        return m;
    }
    while (L)
    {
		if (L->Next == P)
		{
			m->Next = L->Next;
			L->Next = m;
			return head;
		}
		L = L->Next;
    }

        printf("Wrong Position for Insertion\n");
        return ERROR;

}

List Delete(List L, Position P)
{
    List m, head;

    if (P == L)
    {
        L = L->Next;
        return L;
    }
    head = L;

    while (L)
    {
        if (L->Next == P )
        {

            L->Next = P->Next;
            return head;
        }

        L = L->Next;
    }
  printf("Wrong Position for Deletion\n");

    return ERROR;

}
