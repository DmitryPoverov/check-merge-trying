package ru.clevertec.console.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.clevertec.console.serviceClass.CheckService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ServiceHandler implements InvocationHandler {

    private static final Logger LOGGER = LogManager.getLogger();
    private final CheckService checkService;

    public ServiceHandler(CheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (args == null) {
            LOGGER.info("args = null");
        } else {
            Arrays.stream(args).forEach(arg -> {
                if ("String[]".equals(arg.getClass().getSimpleName())) {
                    LOGGER.info(Arrays.toString((String[])arg));
                } else {
                    LOGGER.info(arg);
                }
            });
        }

        return method.invoke(checkService, args);
    }
}
