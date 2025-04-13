package pixel.academy.spring_core_ioc;

import org.springframework.stereotype.Component;

@Component
public class ItalianChef implements Chef {
    @Override
    public String getDailyRecipe() {
        return "Prepare pasta al pomodoro with fresh tomatoes and basil!";
    }

    @Override
    public String getDailyRecipe2() {
        return "Maliga cu branza!";
    }

    @Override
    public String getDailyRecipe3() {
        return "Friptura!";
    }

    @Override
    public String getDailyRecipe4() {
        return "Tiramisu!";
    }

}
