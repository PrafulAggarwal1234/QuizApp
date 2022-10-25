package com.example.quizapp

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_QUESTIONS:String="correct_questions"


    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to",
            R.drawable.flag_belgium,
            "Nepal","Belgium","romania","austria",
            2

        )
        questionsList.add(que1)
        val que2 = Question(
            2,"What country does this flag belong to",
            R.drawable.flag_ajerbijan,
            "Nepal","Belgium","ajerbijan","austria",
            3

        )
        questionsList.add(que2)

        val que3 = Question(
            3,"What country does this flag belong to",
            R.drawable.flag_india,
            "India","Belgium","romania","austria",
            1

        )
        questionsList.add(que3)

        val que4 = Question(
            4,"What country does this flag belong to",
            R.drawable.flag_jordan,
            "Nepal","Belgium","romania","jordan",
            4

        )
        questionsList.add(que4)

        val que5 = Question(
            5,"What country does this flag belong to",
            R.drawable.flag_nepal,
            "Hindustan","Nepal","romania","austria",
        2

        )
        questionsList.add(que5)

        val que6 = Question(
            6,"What country does this flag belong to",
            R.drawable.flag_mauritus,
            "Nepal","Belgium","Mauritius","Austria",
            3

        )
        questionsList.add(que6)

        val que7 = Question(
            7,"What country does this flag belong to",
            R.drawable.flag_samoa,
            "Nepal","samoa","romania","austria",2

        )
        questionsList.add(que7)

        val que8 = Question(
            8,"What country does this flag belong to",
            R.drawable.flag_srilanka,
            "Nepal","Belgium","romania","srilanka",4


        )
        questionsList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to",
            R.drawable.flag_uk,
            "Nepal","Belgium","UK","austria",3


        )
        questionsList.add(que9)

        val que10 = Question(
            10,"What country does this flag belong to",
            R.drawable.falg_papua_new_guinea,
            "Nepal","papua_new_guinea","romania","austria",
            2

        )
        questionsList.add(que10)
        return questionsList
    }
}