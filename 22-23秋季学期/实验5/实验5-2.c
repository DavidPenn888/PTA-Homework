
struct LNode{
    BinTree ch;
    struct LNode* Next;
};
typedef struct LNode* L;

void InorderTraversal( BinTree BT ){
    if(!BT) return;
    InorderTraversal(BT->Left);
    printf(" %c",BT->Data);
    InorderTraversal(BT->Right);
}

void PreorderTraversal( BinTree BT ){
    if(!BT) return;
    printf(" %c",BT->Data);
    PreorderTraversal(BT->Left);
    PreorderTraversal(BT->Right);
}

void PostorderTraversal( BinTree BT ){
    if(!BT) return;
    PostorderTraversal(BT->Left);
    PostorderTraversal(BT->Right);
    printf(" %c",BT->Data);
}

void LevelorderTraversal( BinTree BT ){
    if(!BT) return;
    L f,r,t,p;
    f = (L) malloc(sizeof(struct LNode));
    r = f;
    f->ch = BT;
    r->Next = NULL;
    while(f){
        printf(" %c",f->ch->Data);
        p = f;
        if(p->ch->Left){
            t = (L) malloc(sizeof(struct LNode));
            t->Next = NULL;
            t->ch = p->ch->Left;
            r->Next = t;
            r = t;
        }
        if(p->ch->Right){
            t = (L) malloc(sizeof(struct LNode));
            t->Next = NULL;
            t->ch = p->ch->Right;
            r->Next = t;
            r = r->Next;
        }
        f = f->Next;
        free(p);
    }
}
