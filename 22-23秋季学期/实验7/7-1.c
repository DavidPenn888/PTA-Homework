Position BinarySearch( List L, ElementType X ) {
    int low = 1;
    int high = L->Last;
    int pos;
    
    while(low<=high) {
        pos = (low + high) / 2;
        
        if (L->Data[pos] == X)
            return pos;
        else if (L->Data[pos] > X) {
            high = pos - 1;
        }
        else if (L->Data[pos] < X) {
            low = pos + 1;
        }
    }
    return NotFound;
}
