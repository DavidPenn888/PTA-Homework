int SearchBST(BSTNode *bt,KeyType k){
	if(!bt)
		return 0;
	printf("%d ",bt->key);
	if(k == bt->key) 
        return 1;
    else if(k < bt->key)
    	return SearchBST(bt->lchild,k);
	else
		return SearchBST(bt->rchild,k);
}
