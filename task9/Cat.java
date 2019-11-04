package task9;

 class Cat extends Animal implements Run, Swim {
    @Override
    public void getName() {
        System.out.println("Барсик");
    }

    @Override
    public void runInfo() {
        System.out.println("Барсик бегает");
    }

     @Override
     public void swimInfo() {
         System.out.println("Барсик боится воды");
     }
 }
