void insertionSort(int arr[], int n)
{
    int i,j,t,p,k;
    for(i=0;i<n-1;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[j]<arr[i])
            {
                p=arr[j];
                for(k=j;k>i;k--)
                {
                    arr[k]=arr[k-1];
                }
                arr[k]=p;
            }
        }
    }
}
