def solution(operations):
    heap = []

    for i in operations:
        a = i.split(" ")
        if a[0] == "I":
            heap.append(int(a[1]))
            heap.sort()
        else:
            if a[1] == "-1" and heap:
                heap.remove(heap[0])
            elif a[1] == "1" and heap:
                heap.remove(heap[-1])
    
    if heap:
        return [heap[-1], heap[0]]
    else:
        return [0, 0]