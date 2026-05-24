# 后端技术栈学习计划

> 仓库：https://github.com/dwanda/backend-learning
> 学习者：dwanda

## 技术栈总览

| 领域 | 技术 | 难度 | 应用场景 |
|------|------|------|----------|
| 语言基础 | Java 21 | ⭐⭐⭐ | 所有后端开发的基础 |
| 构建工具 | Maven | ⭐⭐ | 项目构建、依赖管理 |
| 框架核心 | Spring Boot 3.4 | ⭐⭐⭐ | 快速构建独立应用 |
| 数据存储 | MySQL 8.0 | ⭐⭐⭐ | 核心业务数据持久化 |
| 缓存 | Redis 6.x | ⭐⭐⭐ | 缓存 / 会话 / 分布式锁 |
| 微服务 | Spring Cloud | ⭐⭐⭐⭐ | 微服务治理 |
| 阿里生态 | Spring Cloud Alibaba | ⭐⭐⭐⭐ | 阿里云微服务 |
| 注册配置 | Nacos 2.0 | ⭐⭐⭐ | 服务注册发现 + 配置中心 |
| 消息队列 | RabbitMQ | ⭐⭐⭐ | 异步消息、事件驱动 |
| 搜索引擎 | Elasticsearch 8.x | ⭐⭐⭐⭐ | 全文检索、日志分析 |
| 对象存储 | FDS | ⭐⭐⭐ | 文件/文档/报告存储 |
| 流式处理 | Talos | ⭐⭐⭐⭐ | 流式数据处理 |
| 设计思想 | DDD（领域驱动设计） | ⭐⭐⭐⭐⭐ | 复杂业务建模 |

---

## 🎯 短期目标：独立开发 CRUD 功能

**目标定义**：能从零搭建 Spring Boot 项目、连接 MySQL、实现完整 RESTful CRUD API，并能解释每一层代码的职责。

**涉及技术**：Java 21（基础语法）→ Maven（基本使用）→ Spring Boot 3.4（核心）→ MySQL 8.0 + JPA（数据层）

**预计耗时：2-3 周**

### CRUD 必备清单

- [ ] 用 [start.spring.io](https://start.spring.io) 创建 Spring Boot 3.4 + JPA + MySQL 项目
- [ ] 理解 `pom.xml` 结构，会用 `mvn clean package`
- [ ] 掌握 `@RestController` + `@GetMapping` / `@PostMapping` / `@PutMapping` / `@DeleteMapping`
- [ ] 掌握 Controller → Service → Repository 三层分层，理解各层职责
- [ ] 用 `@Entity` + JPA Repository 完成数据库表映射和 CRUD 操作
- [ ] 掌握 `@RequestBody` / `@RequestParam` / `@PathVariable` 参数接收
- [ ] 配置 `application.yml` 连接 MySQL 8.0
- [ ] 掌握 `@Transactional` 基本事务
- [ ] 统一返回结果包装 + 统一异常处理（`@RestControllerAdvice`）
- [ ] 参数校验（`@Valid` + Bean Validation）

### CRUD 检验标准

完成以下"用户管理"API 即视为 CRUD 目标达成：

| 接口 | 说明 |
|------|------|
| `POST /users` | 创建用户 |
| `GET /users/{id}` | 查询用户详情 |
| `GET /users` | 分页列表 |
| `PUT /users/{id}` | 更新用户 |
| `DELETE /users/{id}` | 删除用户 |

---

## 📊 学习优先级总览

```
🎯 P0（立即学）  → CRUD 开发能力           预计 2-3 周
⭐ P1（尽快学）  → Java/Maven 深入 + Redis + Nacos + DDD 入门   预计 4-6 周
📚 P2（按需学）  → RabbitMQ + Elasticsearch                    预计 5-7 周
🔮 P3（后面学）  → Spring Cloud 微服务 + DDD 深入 + FDS + Talos  预计 10-16 周
```

---

## 🎯 P0：CRUD 开发能力（短期目标）

### 1. Spring Boot 起步 + Java 基础（2-3 天）

**必须掌握：**
| 知识点 | 要求 |
|--------|------|
| JDK 21 安装 / IDEA 配置 | 能创建 Spring Boot 项目 |
| Maven 基础 | 看懂 `pom.xml`，会 `mvn clean package` |
| `@SpringBootApplication` | 知道项目从哪启动 |
| `@RestController` + HTTP 方法注解 | 写出 GET/POST API 返回 JSON |

**可跳过：** Maven 多模块、自动配置原理、Java 高级特性

### 2. 分层架构 + 数据库 CRUD（3-5 天）

**必须掌握：**
| 知识点 | 要求 |
|--------|------|
| Controller → Service → Repository 三层分层 | 理解各层职责 |
| `@Entity` + JPA Repository | 实体映射 + CRUD 操作 |
| `@Service` + 构造器注入 | 依赖注入 |
| `@RequestBody` / `@RequestParam` / `@PathVariable` | 参数接收 |
| `application.yml` 配置 MySQL 数据源 | 连接数据库 |
| `@Transactional` | 基本事务 |
| 统一返回包装 `R<T>` | 规范响应格式 |

**可跳过：** JPA 复杂关联、事务传播、连接池调优

### 3. 完善与实战（2-3 天）

**必须掌握：**
| 知识点 | 要求 |
|--------|------|
| `@Valid` + Bean Validation | 请求参数校验 |
| `@RestControllerAdvice` + `@ExceptionHandler` | 统一异常处理 |
| 分页查询 | `Pageable` + `Page<T>` |
| 日志（SLF4J + Logback） | 基本日志输出 |

**产出：**
- `code/spring-boot-demo/` — 用户管理 CRUD 完整项目
- `notes/crud-learning-notes.md` — CRUD 学习总结

---

## ⭐ P1：增强能力

### Phase 1：Java 21 + Maven 深入学习（2-3 周）

- [ ] Java 21 新特性：Record、Sealed Class、Pattern Matching、Virtual Threads
- [ ] 函数式编程：Lambda、Stream API、Optional
- [ ] 并发编程：线程池、CompletableFuture、Virtual Threads
- [ ] Maven 深入：生命周期、依赖管理（scope/exclusions）、多模块构建

**产出：**
- `code/java-basics/` — Java 21 特性演示代码
- `code/maven-demo/` — Maven 多模块示例
- `notes/java-21-notes.md` — Java 21 知识点总结

### Phase 2：MySQL 8.0 + Redis 6.x（3-4 周）

- [ ] MySQL 进阶：索引优化、SQL 执行计划、事务隔离级别、MVCC
- [ ] MySQL 实战：表设计、分库分表策略、慢查询优化
- [ ] Redis 核心：5 种基本数据类型、持久化、过期策略
- [ ] Redis 高级：分布式锁、Redisson、缓存穿透/击穿/雪崩
- [ ] Spring Data Redis + `RedisTemplate`
- [ ] 缓存注解：`@Cacheable` / `@CacheEvict`

**产出：**
- `notes/mysql-notes.md` — MySQL 知识点总结
- `notes/redis-notes.md` — Redis 知识点总结
- `teaching/redis-cache-strategies.html` — 缓存策略教学 HTML
- `teaching/mysql-index-explainer.html` — 索引优化教学 HTML

### Phase 3：Spring Boot 3.4 深入学习（3-4 周）

- [ ] Spring 核心：IoC 容器、AOP、Bean 生命周期
- [ ] Spring Boot 自动配置、起步依赖、Actuator
- [ ] MyBatis-Plus 集成（对比 JPA）
- [ ] 单元测试与集成测试（JUnit 5 + Mockito + Testcontainers）
- [ ] Spring Boot 项目实战

**产出：**
- `code/spring-boot-demo/` — Spring Boot 实战项目（在 CRUD 项目基础上迭代）
- `notes/spring-boot-notes.md` — Spring Boot 知识点总结
- `teaching/spring-boot-architecture.html` — 架构图解

### Phase 4：Nacos + 配置管理（3-4 周）

- [ ] Nacos 搭建：单机与集群部署
- [ ] 服务注册与发现：Nacos Discovery
- [ ] 配置中心：Nacos Config、`@RefreshScope` 动态刷新
- [ ] DDD 入门：理解四层包结构（adapter / application / domain / infrastructure）

**产出：**
- `notes/nacos-notes.md` — Nacos 知识点总结
- `notes/ddd-basics-notes.md` — DDD 入门总结

---

## 📚 P2：中间件实战（按需学习）

### Phase 5：RabbitMQ（2-3 周）

- [ ] 核心概念：Exchange、Queue、Binding、Routing Key
- [ ] 消息模式：Direct / Topic / Fanout / Headers
- [ ] 可靠性：生产者确认、消费者确认、死信队列
- [ ] Spring Boot 集成 RabbitMQ：`RabbitTemplate` + `@RabbitListener`
- [ ] 实战场景：订单异步处理、消息补偿

**产出：**
- `code/rabbitmq-demo/` — RabbitMQ 集成示例
- `notes/rabbitmq-notes.md` — 知识点总结
- `teaching/rabbitmq-messaging.html` — 消息队列教学 HTML

### Phase 6：Elasticsearch 8.x（3-4 周）

- [ ] ES 核心概念：索引、分片、映射、分词
- [ ] DSL 查询：全文检索、聚合分析
- [ ] ES 集群架构与调优
- [ ] Spring Data Elasticsearch 集成
- [ ] Elasticsearch + Kibana + Logstash（ELK）
- [ ] 实战场景：日志分析、商品搜索

**产出：**
- `code/es-demo/` — ES 集成与查询示例
- `notes/elasticsearch-notes.md` — 知识点总结
- `teaching/elasticsearch-search.html` — 搜索引擎教学 HTML

---

## 🔮 P3：进阶精通（后续学习）

### Phase 7：Spring Cloud 微服务（3-4 周）

- [ ] Spring Cloud Gateway：路由、断言、过滤器
- [ ] OpenFeign：声明式服务调用
- [ ] Sentinel：流量控制、熔断降级

**产出：**
- `code/spring-cloud-demo/` — 微服务示例项目
- `notes/spring-cloud-notes.md` — Spring Cloud 知识点总结
- `teaching/microservice-architecture.html` — 微服务架构图解

### Phase 8：Spring Cloud Alibaba（2-3 周）

- [ ] Spring Cloud Alibaba 生态全景
- [ ] Seata：分布式事务管理
- [ ] RocketMQ / 与 RabbitMQ 对比
- [ ] 整合 Nacos + Sentinel + Gateway + Feign

**产出：**
- `code/alibaba-demo/` — 阿里微服务全套整合
- `notes/cloud-alibaba-notes.md` — 知识点总结

### Phase 9：DDD 领域驱动设计 深入（3-4 周）

- [ ] DDD 核心概念：实体、值对象、聚合、领域事件
- [ ] 战略设计：限界上下文、上下文映射
- [ ] 战术设计：Repository、Factory、Domain Service
- [ ] DDD + Spring Boot 实战落地
- [ ] 微服务划分与 DDD 的结合

**产出：**
- `code/ddd-demo/` — DDD 实战示例
- `notes/ddd-notes.md` — 知识点总结
- `teaching/ddd-modeling.html` — DDD 建模教学 HTML

### Phase 10：FDS 文件存储（1-2 周）

- [ ] 对象存储概念与设计
- [ ] FDS SDK 接入
- [ ] 文件上传/下载/分片
- [ ] 权限管理与访问控制

**产出：**
- `code/fds-demo/` — FDS 集成示例
- `notes/fds-notes.md` — 知识点总结

### Phase 11：Talos 流式数据处理（2-3 周）

- [ ] 流处理核心概念：Source、Sink、Transform
- [ ] Talos SDK 接入
- [ ] 实时数据处理 Pipeline
- [ ] 与消息队列结合的场景

**产出：**
- `code/talos-demo/` — Talos 集成示例
- `notes/talos-notes.md` — 知识点总结

---

## 仓库目录结构

```
backend-learning/
├── README.md                   # 仓库总览
├── CLAUDE.md                   # 仓库级 Claude 指令（学习计划概要）
├── learning-plan/
│   └── plan.md                 # 学习计划（本文件）
├── notes/                      # 知识点总结（Markdown）
│   ├── crud-learning-notes.md
│   ├── java-21-notes.md
│   ├── mysql-notes.md
│   ├── redis-notes.md
│   ├── spring-boot-notes.md
│   ├── nacos-notes.md
│   ├── ddd-basics-notes.md
│   ├── spring-cloud-notes.md
│   ├── cloud-alibaba-notes.md
│   ├── rabbitmq-notes.md
│   ├── elasticsearch-notes.md
│   ├── ddd-notes.md
│   ├── fds-notes.md
│   └── talos-notes.md
├── code/                       # 代码实战（按技术分目录）
│   ├── spring-boot-demo/       # CRUD + Spring Boot 实战（P0 + P1）
│   ├── java-basics/
│   ├── maven-demo/
│   ├── spring-cloud-demo/
│   ├── alibaba-demo/
│   ├── rabbitmq-demo/
│   ├── es-demo/
│   ├── ddd-demo/
│   ├── fds-demo/
│   └── talos-demo/
└── teaching/                   # 教学 HTML 文档
    ├── redis-cache-strategies.html
    ├── mysql-index-explainer.html
    ├── spring-boot-architecture.html
    ├── microservice-architecture.html
    ├── rabbitmq-messaging.html
    ├── elasticsearch-search.html
    └── ddd-modeling.html
```

## 学习建议

1. **P0 优先**：先集中精力完成 CRUD 目标，这是后端开发的"驾照"，完成后就能参与大部分业务开发
2. **P0 完成后，按需进入 P1**：不要跳过 P0 直接学后面的内容
3. **动手实践**：每个模块学完都要写代码，代码存放在 `code/` 目录
4. **输出倒逼输入**：写知识点总结（`notes/`）和教学文档（`teaching/`），能教别人才算真正学会
5. **Git 记录成长**：每次学习都有 commit 记录，形成完整的学习轨迹
6. **遇到问题**：先尝试自己解决（查官方文档、StackOverflow），再记入知识点

## 总预计耗时

| 优先级 | 内容 | 预计时长 |
|--------|------|----------|
| 🎯 P0 | CRUD 开发能力 | 2-3 周 |
| ⭐ P1 | Java/Maven 深入 + Redis + Nacos + DDD 入门 | 4-6 周 |
| 📚 P2 | RabbitMQ + Elasticsearch | 5-7 周 |
| 🔮 P3 | Spring Cloud 微服务 + Alibaba + DDD 深入 + FDS + Talos | 10-16 周 |
| **合计** | **全部完成** | **约 21-32 周（5-8 个月）** |
