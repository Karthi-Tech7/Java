//in java logical operator are symbols that connect two or more expressions of boolean type(ex:true or false)
//and return a boolea values as a result.
//&& compare two values
class lgop{
    public static void main(String arges[])
    {
        boolean remote = false;
        boolean battery = false;
      
        // if(remote && battery)//and oper
        if (remote || battery)//or oper
        {
             System.out.print("tv remote is work");
        }   
        else{
            System.out.print("tv remote is not work");
        }    
       

    }
}