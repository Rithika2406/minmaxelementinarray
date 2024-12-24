class Main {
    public static void main(String[] args) {
        int arr[]={2,3,6,8,9,7};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
        if(arr[i]<min)
        {
            min=arr[i];
        }
        if(arr[i]>max)  
        {
            max=arr[i];
        }
        }
        System.out.println("Minimum element is:"+min);
        System.out.println("Maximum element is:"+max);
    }
}