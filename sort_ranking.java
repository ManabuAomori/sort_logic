{\rtf1\ansi\ansicpg932\cocoartf1348\cocoasubrtf170
{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset128 HiraKakuProN-W3;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 import java.util.*;\
import java.util.ArrayList;\
import java.util.Iterator;\
import java.util.Collections;\
import java.util.Comparator;\
\
class Score \{\
        // 
\f1 \'96\'bc\'91\'4f
\f0 \
        private String name;\
        // 
\f1 \'89\'70\'8c\'ea
\f0 \
        private int english;\
        // 
\f1 \'8d\'91\'8c\'ea
\f0 \
        private int japanese;\
        // 
\f1 \'90\'94\'8a\'77
\f0 \
        private int math;\
        // 
\f1 \'83\'52\'83\'93\'83\'58\'83\'67\'83\'89\'83\'4e\'83\'5e
\f0 \
        public Score(String name, int english,  int japanese, int math)\{\
                this.name = name;\
                this.english = english;\
                this.japanese = japanese;\
                this.math = math;\
        \}\
        public String getName()\{ return name; \}\
        public void setName(String name)\{ this.name = name; \}\
        public int getEnglish() \{ return english; \}\
        public void setEnglish(int english) \{ this.english = english; \}\
        public int getJapanese() \{ return japanese; \}\
        public void setJapanese(int japanese) \{ this.japanese = japanese; \}\
        public int getMath() \{ return math; \}\
        public void seMath(int math) \{ this.math = math; \}\
\}\
\
class ScoreComparator implements Comparator<Score> \{\
        public int compare(Score score1 , Score score2) \{\
                int temp = 0;\
                temp = score2.getEnglish() - score1.getEnglish();\
                 if (temp == 0)\{\
                temp = score2.getJapanese() - score1.getJapanese();\
                        if(temp == 0)\{\
                temp = score2.getMath() - score1.getMath();\
                                if(temp == 0)\{\
                temp = score1.getName().compareTo(score2.getName());\
                \}\
                \}\
                \}\
                return temp;\
        \}\
\}\
\
\
class Main \{\
        public static void main(String[] args) \{\
        ArrayList<Score> al =  new ArrayList<Score>();\
        Scanner cin = new Scanner(System.in);\
        String line;\
        int cnt =0;\
        //while(in.ready())\{\
        while(cin.hasNext() ) \{\
        line = cin.nextLine();\
        //String readed = in.readLine();\
       //line = cin.nextLine();\
        String[] scores = line.split(",",0);\
        if(!(scores[0].equals("name")))\{\
        String name = scores[0];\
int english = Integer.parseInt(scores[1]);\
        int japanese = Integer.parseInt(scores[2]);\
        int math = Integer.parseInt(scores[3]);\
\
        al.add( new Score(name,english, japanese, math));\
\}\
\
        Collections.sort(al,new ScoreComparator());\
\
\
        \}\
        Iterator<Score> it = al.iterator();\
        System.out.println("name,english,japanese,math");\
        while(it.hasNext())\{\
                Score s = it.next();\
                System.out.println(s.getName() + "," + s.getEnglish() + "," + s.getJapanese() + "," + s.getMath());\
        \}\
\}\
\}\
}