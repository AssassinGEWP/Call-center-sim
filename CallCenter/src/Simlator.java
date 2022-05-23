import java.util.Random;

public class Simlator {
    Boolean AgentIsActive = false;
    int NoOfClients,TotalWaitTime,CurrentServiceTime,TotalServiceTime =0;
    int MaxRunTime = 150;
    Queue Clients = new Queue(0) ; // Waiting Clients Queue.
    Queue Served = new Queue(0) ; // Served Clients Queue.
public Simlator(){}

    public void Run_Simulator () { // the start of the simulator.
        for(int i = 0 ; i <= MaxRunTime; i ++)  { // the time loop which each loop is a 1 minute.
//            System.out.println(i);
            PickUpcall(i);
            StartNewCall(i);
            for (int j = 1 ; j <NoOfClients-1  ; j++) { // A loop that passes on each of the Clients inside the Waiting Queue.
                if (Clients.test[j].Active == true) { // Checks if the Client is Being Served or not.
                ProcessCall(j,i);
                }else if (Clients.test[j] != Clients.top){
                        Clients.test[j].WaitingTime++;

                }
            }
        }
        Final repor = new Final();
        repor.Final_Report(Clients);
    }


    public void ProcessCall(int index,int time) { // part where the call is being processed.
            if (Clients.top.ServiceTime ==0) { // In case of the Client has been served , he is moved to the Served Queue.
                AgentIsActive = false ;
                Clients.top.Served = true;
                Clients.top.ServiceTime = CurrentServiceTime;
                Clients.top.WaitingTime = time - Clients.top.ArrivalTime;
                Served.Enqueue(Clients.top);
                Clients.Dequeue();
                NoOfClients--;
            } else { // if the Client is not yet served it continues the process of serving him.
//                System.out.println(CurrentServiceTime);
                Clients.top.ServiceTime--;
            }

    }


    public void PickUpcall (int ArrivalTime) { // part where the call is being generated.
    int Constent = GenerateCall();
    int ServiceTime = GenerateSerivceTime();
        if (Constent >= 5) {
            Customer newCustomer = new Customer(ArrivalTime,ServiceTime); // if the number generated is less than or equal 5 it generates.
            Clients.Enqueue(newCustomer);
            NoOfClients++;
        }

    }
    public void StartNewCall(int time) { // part where it checks if the agent is active or not to start a new call.
        if(AgentIsActive == true || NoOfClients == 0 ) { // if the agent is active is doesn't start a new call.
            return;
        } // if the Agent is idle it starts a new call.
        CurrentServiceTime = Clients.top.ServiceTime;
        TotalWaitTime =+Clients.top.ServiceTime;
        Clients.top.Active = true;
        AgentIsActive = true;
    }

    public int GenerateCall() { // generates a number from 0 to 10.
        Random rand = new Random();
        int upperbound = 11;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
    public int GenerateSerivceTime() { // generates a number from 0 to 30.
        Random rand = new Random();
        int upperbound = 31;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }

}
