import java.util.*;

public class Q114_MenuDrivenArrayOperationsSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[100]; //max size
        int size=0;

        while(true){
            System.out.println("\n========== Menu Driven Array Operation System ==========\n");
            System.out.println("[1.] Create Array");
            System.out.println("[2.] Dispaly Array");
            System.out.println("[3.] Insert Element");
            System.out.println("[4.] Delete Element");
            System.out.println("[5.] Search Element");
            System.out.println("[6.] Update Element");
            System.out.println("[7.] Exit");

            System.out.println("Enter Your Choice:");
            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter number of elements:");
                    size=sc.nextInt();
                    System.out.println("Enter Elements:");
                    for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                    }
                    System.out.println("Array Created Successfully!");
                    break;
                case 2:
                    if(size==0)
                    System.out.println("Array is Empty!");
                    else{
                        System.out.println("Array Element's");
                        for(int i=0;i<size;i++){
                            System.out.print(arr[i]+" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if(size==arr.length){
                        System.out.println("Array is Full!");
                        break;
                    }
                    System.out.println("Enter Position 1 to "+(size+1));
                    int pos=sc.nextInt();

                    if(pos<1 || pos>(size+1)){
                        System.out.println("Invalid Position!");
                        break;
                    }

                    System.out.println("Enter Element:");
                    int element=sc.nextInt();

                    for(int i=size;i>=pos;i--){
                        arr[i]=arr[i-1];
                    }

                    arr[pos-1]=element;
                    size++;
                    System.out.println("Element Inserted Successfully!");
                    break;
                case 4:
                    if(size==0){
                        System.out.println("Array is Empty!");
                        break;
                    }

                    System.out.println("Enter Position 1 to "+(size));
                    pos=sc.nextInt();

                    if(pos<1 || pos>size){
                        System.out.println("Invalid Position!");
                        break;
                    }

                    for(int i=pos-1;i<size-1;i++){
                        arr[i]=arr[i+1];
                    }
                    size--;
                    System.out.println("Element Deleted Successfully!");
                    break;
                case 5:
                    if(size==0){
                        System.out.println("Array is Empty!");
                        break;
                    }

                    System.out.println("Enter element to be search:");
                    element=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<size;i++){
                        if(arr[i]==element){
                            System.out.println("Element Founded at Position "+(i+1));
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Element Not Found!");
                    }
                    break;
                case 6:
                    if(size==0){
                        System.out.println("Array is Empty!");
                        break;
                    }
                    System.out.println("Enter element to be Update:");
                    element=sc.nextInt();

                    for(int i=0;i<size;i++){
                        if(arr[i]==element){
                            System.out.println("Enter elemnt that you want to put:");
                            int newElement=sc.nextInt();
                            arr[i]=newElement;
                            break;
                        }
                    }
                    break;
                case 7:
                    System.out.println("__ Thank You! __");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
