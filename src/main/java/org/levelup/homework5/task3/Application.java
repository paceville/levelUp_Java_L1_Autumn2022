package org.levelup.homework5.task3;

public class Application {
    public static void main(String[] args) {
        Reader harryPotter = new Reader("Harry", "Potter", "00001", Reader.Faculty.GRYFFINDOR, 19800731, 1111111);
        Reader dracoMalfoy = new Reader("Draco", "Malfoy", "00002", Reader.Faculty.SLYTHERIN, 19800605, 2222222);
        Reader choChang = new Reader("Cho", "Chang", "00003", Reader.Faculty.RAVENCLAW, 19790105, 3333333);
        Reader cedricDiggory = new Reader("Cedric", "Diggory", "00004", Reader.Faculty.HUFFLEPUFF, 19770525, 4444444);

        Reader reader = new Reader();
        Reader[] students = {harryPotter, dracoMalfoy, choChang, cedricDiggory};
        reader.studentsList(students);

        Book monsterBookOfMonsters = new Book("The Monster Book of Monsters", "Edwardus Lima");
        Book historyOfMagic = new Book("A History of Magic", "Bathilda Bagshot");
        Book magicalDraftsAndPotions = new Book("Magical Drafts and Potions", "Arsenius Jigger");
        Book unfoggingTheFuture = new Book("Unfogging the Future", "Cassandra Vablatsky");
        Book essentialDefenceAgainstTheDarkArts = new Book("The Essential Defence Against the Dark Arts", "Arsenius Jigger");

        String[] studyBooks = {"Year with the Yeti", "Advanced Rune Translation", "Defensive Magical Theory", "Voyages with Vampires", "Spellman's Syllabary"};

        Book[] books = {monsterBookOfMonsters, historyOfMagic, magicalDraftsAndPotions, unfoggingTheFuture, essentialDefenceAgainstTheDarkArts};

        harryPotter.takeBook(5);
        harryPotter.returnBook(3);
        dracoMalfoy.takeBook(studyBooks);
        dracoMalfoy.returnBook(studyBooks);
        choChang.takeBook(books);
        cedricDiggory.returnBook(books);
    }
}
