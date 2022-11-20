void BFS ( LGraph Graph, Vertex S, void (*Visit)(Vertex) )
{

    PtrToAdjVNode p;
    PtrToAdjVNode queue[MaxVertexNum];int head=0,tail=0;
    Visit(S);
    Visited[S]=true;

    queue[tail++]=Graph->G[S].FirstEdge;
    while(head!=tail){
        p=queue[head++];
        while(p!=NULL){
            if(Visited[p->AdjV]==false){
                queue[tail++]=Graph->G[p->AdjV].FirstEdge;
                Visit(p->AdjV);
                Visited[p->AdjV]=true;
            }
            p=p->Next;
        }
    }
}
