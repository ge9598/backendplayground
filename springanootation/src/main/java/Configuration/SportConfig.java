package Configuration;

import com.xiaoge.springanootation.DAO.Coach;
import com.xiaoge.springanootation.DAO.TableTennisCoach;
import com.xiaoge.springanootation.Service.FortuneService;
import com.xiaoge.springanootation.Service.SadFortuneService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration

public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    @Bean
    public Coach tableTennisCoach(){
        return new TableTennisCoach(sadFortuneService());
    }



}
