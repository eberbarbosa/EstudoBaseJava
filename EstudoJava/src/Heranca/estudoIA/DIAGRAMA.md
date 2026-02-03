# DIAGRAMA DE HERANÇA - Sistema de Comissões

## 📊 ESTRUTURA ATUAL

```java
Object (classe raiz de todas no Java)
    ↑
CommissionEmployee3 (superclasse/concreta)
    |
    ├── Atributos privados:
    │   - firstName: String
    │   - lastName: String  
    │   - socialSecurityNumber: String
    │   - grossSales: double
    │   - commissionRate: double
    │
    ├── Métodos públicos:
    │   + getFirstName(): String
    │   + setFirstName(String): void
    │   + earnings(): double
    │   + toString(): String
    │
    └── Método construtor:
        + CommissionEmployee3(String, String, String, double, double)
    
    ↑ extends (herança)

BasePlusCommissionEmployee4 (subclasse)
    |
    ├── Atributo adicional (privado):
    │   - baseSalary: double
    │
    ├── Métodos próprios:
    │   + getBaseSalary(): double
    │   + setBaseSalary(double): void
    │
    ├── Métodos sobrescritos (@Override):
    │   + earnings(): double  // baseSalary + super.earnings()
    │   + toString(): String  // adiciona info de salário base
    │
    └── Método construtor:
        + BasePlusCommissionEmployee4(..., double salary)
          ↓
          super(first, last, ssn, sales, rate) // PRIMEIRA linha!
```

## 🔄 FLUXO DE EXECUÇÃO

### Quando criamos um `BasePlusCommissionEmployee4`:
```
1. new BasePlusCommissionEmployee4("Eber", "Barbosa", "333-33-3333", 50000, 0.04, 300)
   │
2. Chama construtor BasePlusCommissionEmployee4(...)
   │
3. super(first, last, ssn, sales, rate) → Chama CommissionEmployee3(...)
   │
4. CommissionEmployee3 inicializa SEUS atributos
   │
5. Volta para BasePlusCommissionEmployee4
   │
6. setBaseSalary(300) → inicializa baseSalary
   │
7. Objeto pronto para uso!
```

## 🎯 RELACIONAMENTOS

### 1. Herança ("é-um")
```java
// BasePlusCommissionEmployee4 É-UM CommissionEmployee3
// TUDO que CommissionEmployee3 faz, BasePlusCommissionEmployee4 também faz
BasePlusCommissionEmployee4 emp = new BasePlusCommissionEmployee4(...);

// Posso usar todos os métodos de CommissionEmployee3:
emp.getFirstName();    // OK - herdado
emp.earnings();        // OK - sobrescrito
emp.getBaseSalary();   // OK - próprio da subclasse
```

### 2. Polimorfismo
```java
// Referência da superclasse pode apontar para objeto da subclasse
CommissionEmployee3 emp = new BasePlusCommissionEmployee4(...);

emp.earnings();    // Chama earnings() da SUBclasse (BasePlusCommissionEmployee4)
emp.toString();    // Chama toString() da SUBclasse

// Mas NÃO pode acessar métodos exclusivos da subclasse:
// emp.getBaseSalary(); // ERRO de compilação!
```

## ⚠️ REGRAS IMPORTANTES

### Regra 1: Chamada a super()
```java
public BasePlusCommissionEmployee4(...) {
    super(...); // DEVE ser a PRIMEIRA instrução!
    // resto do código...
}
```

### Regra 2: Acesso a atributos privados
```java
// Na subclasse NÃO podemos acessar diretamente:
// firstName     // ERRO - private na superclasse
// grossSales    // ERRO - private na superclasse

// Devemos usar getters:
getFirstName()   // OK - método público
getGrossSales()  // OK - método público
```

### Regra 3: Sobrescrita (Override)
```java
// Na subclasse:
@Override  // OPCIONAL mas RECOMENDADO
public double earnings() {
    return getBaseSalary() + super.earnings();
    //        ↑                  ↑
    //   atributo próprio   método da superclasse
}
```

## 🧪 EXPERIMENTOS PARA FAZER

### Experimento 1: Comente super()
```java
// Em BasePlusCommissionEmployee4, comente:
// super(first, last, ssn, sales, rate);

// RESULTADO: Erro de compilação!
// "Implicit super constructor CommissionEmployee3() is undefined"
```

### Experimento 2: Tente acessar atributo private
```java
// Em BasePlusCommissionEmployee4, tente:
public void testeAcesso() {
    // System.out.println(firstName); // ERRO - private
    System.out.println(getFirstName()); // OK - via getter
}
```

### Experimento 3: Cadeia de construtores
```java
// Adicione em CommissionEmployee3:
public CommissionEmployee3() {
    System.out.println("Construtor padrão CommissionEmployee3");
}

// O que acontece se remover super(...) da subclasse?
// RESPOSTA: Java chama super() implicitamente!
```

## 📈 HIERARQUIA COMPLETA (JAVA)

```
java.lang.Object
    ↑
CommissionEmployee3
    ↑
BasePlusCommissionEmployee4
```

**IMPORTANTE**: Mesmo sem escrever `extends Object`, toda classe Java herda de Object!

## 💡 BOAS PRÁTICAS

1. **Sempre use @Override** para métodos sobrescritos
2. **Mantenha atributos privados** (encapsulamento)
3. **Use getters/setters** para acesso controlado
4. **Documente** com comentários claros
5. **Teste** com diferentes valores de entrada

## 🔗 EXEMPLO DE USO

```java
// Criação
BasePlusCommissionEmployee4 emp = 
    new BasePlusCommissionEmployee4("João", "Silva", "123-45-6789", 
                                    10000, 0.05, 1000);

// Cálculo polimórfico
CommissionEmployee3[] employees = new CommissionEmployee3[2];
employees[0] = new CommissionEmployee3("Maria", "Souza", "987-65-4321", 8000, 0.06);
employees[1] = emp; // Upcasting automático

for (CommissionEmployee3 e : employees) {
    System.out.println(e.earnings()); // Chama o earnings() apropriado
}
```