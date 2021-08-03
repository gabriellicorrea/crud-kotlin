//package br.com.gabi.configuration
//
//import br.com.gabi.model.User
//import br.com.gabi.repository.UserRepository
//import io.micronaut.context.event.StartupEvent
//import io.micronaut.runtime.event.annotation.EventListener
//import org.slf4j.LoggerFactory
//import javax.inject.Singleton
//
//@Singleton
//class StartupService(private val userRepository: UserRepository){
//
//    private val log = LoggerFactory.getLogger(StartupService::class.java)
//
//    @EventListener
//    fun onStartupEvent(event: StartupEvent){
//        val user = userRepository.save(
//            User(
//            12345678900,
//            "123456"
//        ))
//        log.info("Usuario adicionado: {}", user)
//    }
//}