package com.z7.bespoke.discovery.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.netflix.appinfo.InstanceInfo;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaRegistryAvailableEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaServerStartedEvent;
import org.springframework.context.event.EventListener;

/**
 * @ClassName: EurekaStateChangeListener
 * @Description: 注册中心监听
 * @Date: 2024-08-16 15:37
 * @Author: z7
 **/
@Slf4j
@Component
public class EurekaStateChangeListener {

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info("服务注册： {} ({}:{})", instanceInfo.getAppName(), instanceInfo.getIPAddr(), instanceInfo.getPort());
        // 你可以在这里添加推送逻辑，例如通过消息队列、邮件等通知
        /*在事件监听器中，你可以根据自己的需求来推送服务状态变化的消息。例如，你可以使用以下方法：

	•	消息队列: 将服务状态变化的信息推送到消息队列（如 RabbitMQ, Kafka）中，以供其他服务或系统处理。
	•	Webhook: 通过 Webhook 将服务状态变化的信息推送到外部服务。
	•	邮件通知: 通过邮件服务将服务状态变化的信息发送给管理员或相关人员。
*/
    }

    @EventListener
    public void listen(EurekaInstanceCanceledEvent event) {
        log.info("服务下线： {} ({})", event.getAppName(), event.getServerId());
        // 你可以在这里添加推送逻辑
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        InstanceInfo instanceInfo = event.getInstanceInfo();
        log.info("服务续约： {} ({}:{})", instanceInfo.getAppName(), instanceInfo.getIPAddr(), instanceInfo.getPort());
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        log.info("Eureka 注册表可用");
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        log.info("Eureka 服务器启动");
    }
}
