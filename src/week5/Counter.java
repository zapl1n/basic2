package week5;

public class Counter {
    private int counter;
    private boolean check;

    Counter(int startingValue, boolean check){

        this.check = check;
        if(check){
            if(!(startingValue < 0)){
                this.counter = startingValue;
            }

        } else {
            this.counter = startingValue;
        }

    }

    public Counter(int startingValue){
        this.counter = startingValue;
        this.check = false;
    }
    public Counter(boolean check){
        this.counter = 0;
        this.check = check;

    }
    public Counter(){
        this.counter = 0;
        this.check = false;

    }

    public int value(){
        return counter;

    }

    void increase(){
        counter += 1;

    }

    public void decrease(){
        if(check){
            if(!(this.counter - 1 < 0)){
                counter -= 1;
            }

        }else {
            counter -= 1;
        }


    }

    void increase(int increaseAmount){
        counter += increaseAmount;

    }

    public void decrease(int decreaseAmount){
        if(check){
            if(!(this.counter - decreaseAmount < 0)){
                counter -= decreaseAmount;
            }

        } else {
            counter -= decreaseAmount;
        }


    }
}