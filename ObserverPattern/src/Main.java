
/*
*
We want to represent a data centralization system to which many media/newspaper subscribe.
* Every time this system updates its data, all the subscribers get notified with the update.*/


public class Main {
    public static void main(String[] args) {


        ISEPObserver isepObserver = new ISEPObserver("isep@fr.com");

        GoogleNewsObserver googleNewsObserver = new GoogleNewsObserver("google.com");

        //create a publisher to send thru
        MessagePublisher messagePublisher = new MessagePublisher();
        messagePublisher.attach(isepObserver);
        messagePublisher.attach(googleNewsObserver);


        Message info = new Message();
        info.setMessage("--see thru the observe pattern ;)--");
        messagePublisher.notifyUpdate(info);

        System.out.println("\nsee when there is new observer in the message publisher: ");
        PetObserver petObserver = new PetObserver("your cat");
        messagePublisher.attach(petObserver);

        Message secondinfo = new Message();
        secondinfo.setMessage("there are new food here, come eat ! ");
        messagePublisher.notifyUpdate(secondinfo);


        //isep unsubscribe the channel
        System.out.println("\nisep unsubsribed the channel");
        messagePublisher.detach(isepObserver);
//        petObserver.update(secondinfo); --> only the cat update
        messagePublisher.notifyUpdate(secondinfo);

    }
}