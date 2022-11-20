void DFS( MGraph Graph, Vertex V, void (*Visit)(Vertex) )
{
    int i;
    Vertex stack[MaxVertexNum];int top=-1;//定义栈
    Vertex p;
    Visit(V);
    Visited[V]=true;

    stack[++top]=V;
    while(top!=-1){
        for(i=0;i<Graph->Nv;i++){
            if(Graph->G[V][i]<INFINITY && Visited[i]==false){
                Visit(i);
                Visited[i]=true;
                stack[++top]=i;
                V=stack[top];
                break;
            }
        }
        if(i==Graph->Nv){
            V=stack[--top];
        }
    }
}

