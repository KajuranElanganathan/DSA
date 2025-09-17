def binarySearch(lst,target):

    first = 0 ##first pointer

    last = len(lst) - 1  ##2nd pointer


    while(first <= last): ## as long as the 2nd pointer is bigger than the first, if the value doesn't exist the case becomes where the pointers, and midpoint point to the same value
                        ##if the target is greater than the midpoint, but not in the array, first gets added one, so it becomes bigger than last, so while loop ends. Same thing where if the 
                        ##target value is less than the midpoint, then the last value gets subtarcted and becomes less than the first so while loop ends again.

        mid = (first + last) // 2 


        if (lst[mid]== target):
            return mid
        elif (lst[mid] < target):
            first = mid + 1
        else:
            last = mid - 1




    return -1




x = [1,2,3,4,5,6,7,8,9,10]






print(binarySearch(x,10))


