class Lake_duck extends Duck implements flyable,quackable{
    public void fly()
    {
        System.out.println("I can fly");
    }
    public void quack()
    {
        System.out.println("i quack");
    }
}