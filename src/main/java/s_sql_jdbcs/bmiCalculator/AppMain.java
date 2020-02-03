package s_sql_jdbcs.bmiCalculator;

import s_sql_jdbcs.bmiCalculator.repositories.BmiRepository;

public class AppMain {
    public static void main(String[] args) {
        BmiRepository.connect();

        pl.adamTomasiewicz.jdbc_temp.model.BmiRecord record = new pl.adamTomasiewicz.jdbc_temp.model.BmiRecord(80, 180, "Woman", 27.5);
        BmiRepository.addBmiToDb(record);
    }


}
