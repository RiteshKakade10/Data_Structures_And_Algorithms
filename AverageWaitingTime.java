class AverageWaitingTime{
    public double averageWaitingTime(int[][] customers) {
       double wait_time_total=0;
       int current_time=0;

       for(int[] customer:customers)
       {
        int arival=customer[0];
        int service=customer[1];
        if(current_time<arival)
        {
            current_time=arival;
        }
        int waiting_time=current_time - arival+service;
        wait_time_total+=waiting_time;
        current_time+=service;
       }
       return wait_time_total/customers.length;
        
    }
}
