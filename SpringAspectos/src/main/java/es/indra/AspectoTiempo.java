package es.indra;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectoTiempo {

@Around("execution(* es.indra.*.*(..))")
   public Object calculoTiempo(ProceedingJoinPoint joinPoint) throws Throwable {
     
     long t1=System.currentTimeMillis();
 
    Object resultado=joinPoint.proceed(); 
     
    long t2=System.currentTimeMillis();
     
    if( t2-t1>2000) {
         
        System.out.println("Metodo lento:"+ joinPoint.getTarget().getClass()+"."+joinPoint.getSignature().getName() +":"+ (t2-t1));
    }
     
     
    return resultado;
     
 }

}
