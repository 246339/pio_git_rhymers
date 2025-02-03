package edu.kis.vh.nursery;

public class FifoRhymer extends DefaultCountingOutRhymer {

    public DefaultCountingOutRhymer countingOutRhymer = new DefaultCountingOutRhymer();

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
