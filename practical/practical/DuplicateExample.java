class DuplicateExample{

public static void main(string args[]){

int arr[]={24,35,24,67,89,56};

Systeam.out.println(Duplicate elements in given array");

for(int i=0; i<arr.length; i++){
for(int j=i+1; j<arr.length; j++){
if(arr[i]==arr[j])
System.out.println(arr[j]);
}
}
}
}