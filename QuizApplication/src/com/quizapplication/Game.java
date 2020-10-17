package com.quizapplication;

public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questiondata={"The chief constituent of bio gas is?","The first development flight of SLV-3 took place on","Philology is the"};
    String[] options1={"ethane","May 31, 1981","study of bones"};
    String[] options2={"methane","April 17, 1983","study of muscles"};
    String[] options3={"hydrogen","December 21, 1999","study of architecture"};
    String[] options4={"carbon dioxide","December 28, 1995","science of languages"};
    int[] answers={2,1,4};

    public  void initGame() {
        for (int i = 0; i < 3; i++) {
            questions[i] = new Question();

        }

        for (int i = 0; i < 3; i++) {
            questions[i].question = questiondata[i];
            questions[i].option1 = options1[i];
            questions[i].option2 = options2[i];
            questions[i].option3 = options3[i];
            questions[i].option4 = options4[i];
            questions[i].correctAnswer = answers[i];
        }
    }
        public void play()

        {
            player.getDetails();
            for (int i=0;i<3;i++)
            {
                boolean status=questions[i].askQuestion();

                if(status==true)
                {
                    System.out.println("You played well");
                    player.score=player.score+10;

                }
                else{
                    System.out.println(" Try next time");
                }
        }
            System.out.println();
            System.out.println(player.name+" "+"your score is"+" "+player.score);
    }


}
