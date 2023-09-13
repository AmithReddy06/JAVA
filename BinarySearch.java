class BinarySearch {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,46,49,56,63,69,79,89,90,100};
        int target=90;
        int ans=search(arr,0,arr.length,target);
        System.out.println("element is in position "+ans);

    }

    static int search(int[] arr,int low,int high,int target)
    {
        
        if(high>=low)
        {
            int mid=low + (high-low)/2;

            if(arr[mid]==target)
            {return mid;}

            else if(arr[mid]>target)
            {
                return search(arr,low,mid-1,target);
            }
            else return search(arr,mid+1,high,target);
        }
        return -1;
    }
}
