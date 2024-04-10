public class Leasttimetakentobuytickets {
    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        int k = 2;
        int timetaken = 0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[i]<tickets[k]) timetaken+=tickets[i];
            else timetaken+=tickets[k];
            if(i>k && tickets[i]>=tickets[k]) timetaken--;

        }
        System.out.println(timetaken);
    }
}
