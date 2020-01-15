package z_homeworks;

class HomeworkMain_6_string {
    public static void main(String[] args) {
        String stringDino = "Dinozaury (Dinosauria) – zróżnicowany klad zauropsydów. Pojawiły się w triasie, około 237 milionów lat temu. Stanowiły dominującą grupę kręgowców lądowych od początku jury (około 201 milionów lat temu) przez 135 milionów lat, " +
                "do końca kredy (66 milionów lat temu), kiedy wymieranie kredowe (wyznaczające granicę kreda-trzeciorzęd i koniec mezozoiku) doprowadziło do zniknięcia większości linii. " +
                "Zapis kopalny wskazuje, że w jurze ptaki wyewoluowały z dinozaurów zaliczanych do teropodów, wobec czego przez literaturę przedmiotu wydaną w XXI wieku uznawane są za grupę dinozaurów[1]. " +
                "Przeżywając katastrofę sprzed 66 milionów lat, dzięki swym potomkom stały się kontynuatorami linii dinozaurów po czasy współczesne[2].Do ostatnich dziesięcioleci XX wieku wszystkie grupy dinozaurów uznawano za wymarłe. " +
                "Jednakże zapis kopalny wskazuje, że ptaki, nazywane dziś w języku angielskim avian dinosaurs („ptasie dinozaury”)[3], są współczesnymi potomkami opierzonych dinozaurów[4]. Wyewoluowały one ze swych teropodzich przodków w okresie jury[5]. " +
                "Wobec tego ptaki stanowią jedyną linię dinozaurów, która przetrwała zagładę[6].Wobec powyższego do dinozaurów zalicza się również ptaki[7][8][9]. Z kolei dinozaury nie będące ptakami określa się mianem non-avian dinosaurs[10][11][12], " +
                "tłumaczonym na język polski jako „nieptasie dinozaury”[13], pojawia się też określenie „nieptasie teropody”[14].Dinozaury to z taksonomicznego, morfologicznego i ekologicznego punktu widzenia zróżnicowana grupa zwierząt. Do ptaków zaliczanych jest obecnie ponad 10 000 gatunków[15], " +
                "co czyni je najbardziej zróżnicowaną grupą kręgowców z wyjątkiem okoniokształtnych[16][a]. Dzięki dowodom kopalnym do 2006 paleontolodzy wyróżnili ponad 500 rodzajów[17] i ponad tysiąc gatunków nieptasich dinozaurów[18], podczas gdy w 2014 liczba opisanych rodzajów wynosiła 943[19]. " +
                "Dinozaury zamieszkiwały wszystkie kontynenty – na wszystkich bowiem znajdowane są ich szczątki kopalne, jak i występują współczesne gatunki[20]. Zaliczają się do nich zarówno roślinożercy, jak i mięsożercy. Pierwotnie cechowała je dwunożność, ale wiele wymarłych grup obejmowało formy czworonożne, " +
                "a także poruszające się zarówno na dwóch, jak i na czterech łapach. Liczne grupy wykształciły wyszukane struktury, jak rogi czy kryzy. Niektóre taksony wymarłe wykształcały także takie modyfikacje szkieletu, jak kolce czy pancerz. Potwierdzono składanie jaj i budowę gniazd u wszystkich grup. " +
                "O ile dzisiejsze ptaki osiągają zazwyczaj niewielkie rozmiary, co wiąże się z umiejętnością lotu, formy prehistoryczne osiągały często duże rozmiary. Największe zauropody mogły osiągać nawet 58 m długości przy wysokości 9,25 m[21]. Wizja nieptasich dinozaurów jako jednorodnie gigantycznych jest " +
                "jednak nieprawdziwa, wynika z większej tendencji do zachowywania się dużych kości. Wiele nieptasich dinozaurów było niewielkich rozmiarów, jak mierzący około 50 cm długości Xixianykus.Nazwa dinozaury oznacza „straszne jaszczurki”, dlatego też może wprowadzać w błąd – dinozaury nie były jaszczurkami, " +
                "ani nie były z nimi blisko spokrewnione. Reprezentują natomiast oddzielną grupę „gadów”, oprócz ptaków ich najbliższymi współczesnymi krewniakami są krokodyle. Jak wiele wymarłych form, nie wykazują one cech tradycyjnie uznawanych za „gadzie”, jak zmiennocieplność czy poruszanie się na kończynach odwiedzionych na boki. " +
                "Co więcej, wiele grup prehistorycznych zwierząt, takich jak mozazaury, ichtiozaury, pterozaury, plezjozaury, a nawet Dimetrodon, popularnie uznawanych za dinozaury, w rzeczywistości nimi nie są. Przez pierwszą połowę XX wieku, zanim uznano ptaki za dinozaury, większość społeczności naukowej uznawała dinozaury za powolne " +
                "i zmiennocieplne. Zmiana nastąpiła w latach 60. (odrodzenie dinozaurów). Stwierdzono, że wszystkie dinozaury, w tym mezozoiczne, prowadziły aktywny tryb życia i cechowały się szybkim metabolizmem, tak jak dzisiejsi ich przedstawiciele; wykazywały też liczne adaptacje umożliwiające interakcje społeczne.Odkąd naukowcy zaczęli badać " +
                "i opisywać pierwsze skamieliny nieptasich dinozaurów w pierwszej połowie XIX wieku, zmontowane szkielety nieptasich dinozaurów stały się głównymi atrakcjami muzeów wielu krajów, a dinozaury stały się częścią kultury. Wielkie rozmiary niektórych grup, jak również niekiedy przerażająca i fantastyczna natura, zapewniły tym stworzeniom regularną obecność " +
                "w bestsellerach książkowych i filmowych, jak Zaginiony świat Arthura Conan Doyle'a czy Park Jurajski Michaela Crichtona. Trwały entuzjazm opinii publicznej dla tych zwierząt doprowadził do znacznego wsparcia finansowego dla poświęconej im dziedziny nauki. Media regularnie donoszą o nowych odkryciach";

        System.out.println("exe1, number of words: "+countNumberOfWordsInString(stringDino));
        System.out.println("exe2, number of chars: "+countNumberOfCharsInString(stringDino));
        System.out.println("exe3, number of numbers: "+countNumberOfDigitsInString(stringDino));
        System.out.println("exe4, string without anotations: "+stringWithoutAnotations(stringDino));


    }
    //TODO: exe1: policz ilość słów w tekście
    static int countNumberOfWordsInString (String string) {
        if (string == null | string.isEmpty()) {
            return 0;
        }
        int counter = 0;
        int lastCharIndex = string.length() - 1;
        char characters[] = string.toCharArray();
        boolean isWord = false;
        for (int i = 0; i < characters.length; i++) {
            if (Character.isLetter(characters[i]) && !(isWord) &&i <lastCharIndex) {
                isWord = true;
            }
            if (!Character.isLetter(characters[i]) && isWord&&i <lastCharIndex) {
                counter++;
                isWord = false;
            }
            if (Character.isLetter(characters[i]) && i == lastCharIndex) {
                counter++;
            }
        }
        return counter;
    }

    //TODO: exe2: policz ilość liter w tekście
    static int countNumberOfCharsInString (String string) {
        if (string == null | string.isEmpty()) {
            return 0;
        }
        int counter = 0;
        int lastCharIndex = string.length() - 1;
        char characters[] = string.toCharArray();

        for (int i = 0; i < lastCharIndex; i++) {
            if (Character.isLetter(characters[i]) && i < lastCharIndex) {
                counter++;
            }
        }
        return counter;
    }
    //TODO: exe3: Wypisz wszystkie liczby z tekstu
    static int countNumberOfDigitsInString (String string) {
        if (string == null | string.isEmpty()) {
            return 0;
        }
        int counter = 0;
        int lastCharIndex = string.length() - 1;
        char characters[] = string.toCharArray();

        for (int i = 0; i < lastCharIndex; i++) {
            if (Character.isDigit(characters[i]) && i < lastCharIndex) {
                counter++;
            }
        }
        return counter;
    }
    //TODO: exe4: Wypisz tekst bez przypisów ([15])
    static String stringWithoutAnotations (String string) {
        if (string == null | string.isEmpty()) {
            return "0";
        }
        String string2 = string.replace("[\\w+]","");
        return string2;
    }

    //TODO: exe5: Policz ilość linijek w tekście - nie rozumiem???
    //TODO: exe6: Czy litera 'a' została użyta więcej razy niż 'o' ? (Pomiń wielkość liter)
    static boolean isAmoreFrequentThanO (String string) {
     String string2=string.toLowerCase();
        int counterA = 0;
        int counterO = 0;
        char characters[] = string.toCharArray();
        for (int i = 0; i < string.length()-1; i++) {
            if (string2.charAt(i)=='a') {
                counterA++;
            }
            if (string2.charAt(i)=='o') {
                counterA++;
            }
        }
        return counterA>counterO?true:false;
    }

    //TODO: exe7: Czy litera 'a' została użyta więcej razy niż 'o' ? (Uwzględnij wielkość liter)
    static boolean isAmoreFrequentThanOcaseSens (String string) {
        int counterA = 0;
        int counterO = 0;
        char characters[] = string.toCharArray();
        for (int i = 0; i < string.length()-1; i++) {
            if (string.charAt(i)=='a') {
                counterA++;
            }
            if (string.charAt(i)=='o') {
                counterA++;
            }
        }
        return counterA>counterO?true:false;
    }
    //TODO: exe8: Wypisz wszystkie słowa rozpoczynające się od 'Dino' lub 'dino'
    static void countWordsStartingFromDino() {

    }
    //TODO: exe9: Policz znaki interpunkcyjne, wykorzystując ArrayListe zlicz wystapienia poszczegolnych

}
