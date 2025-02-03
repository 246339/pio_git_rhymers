package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

<<<<<<< HEAD
    public defaultCountingOutRhymer countingOutRhymer = new defaultCountingOutRhymer();
=======
    public DefaultCountingOutRhymer countingOutRhymer = new DefaultCountingOutRhymer();
>>>>>>> af3b9da (4.2 Poprawa nazw metod)

    @Override
    public int countOut() {
        while (!callCheck())
            countingOutRhymer.countIn(super.countOut());

        int returnValue = countingOutRhymer.countOut();

        while (!countingOutRhymer.callCheck())
            countIn(countingOutRhymer.countOut());

        return returnValue;
    }
}
