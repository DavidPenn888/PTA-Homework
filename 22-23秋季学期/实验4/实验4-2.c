bool AddQ( Queue Q, ElementType X )
{
	if(Q->MaxSize==Q->Count )
	{
		printf("Queue Full\n");
		return false;
	}
	else
	{
		Q->Count ++;
		Q->Data [(Q->Front+Q->Count) %Q->MaxSize  ]=X;
		return true;
	}
}
ElementType DeleteQ( Queue Q )
{
	if(Q->Count ==0)
	{
		printf("Queue Empty\n");
		return ERROR;
	}
	else
	{
		Q->Count-- ;
		Q->Front =(Q->Front +1)%Q->MaxSize ;
		return Q->Data [Q->Front  ];

	}
}
