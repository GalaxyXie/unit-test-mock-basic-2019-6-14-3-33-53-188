package cashregister;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;


import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class CashRegisterTest {


    @Test
    public void should_print_the_real_purchase_when_call_process() {
        //given

        Item itemA=new Item("可乐",3.5);
        Item itemB=new Item("雪碧",2.5);
        Item items[]={itemA,itemB};
        Purchase purchase=new Purchase(items);
        fakePrinter printer=new fakePrinter();
        CashRegister cashRegister=new CashRegister(printer);

        //when
        cashRegister.process(purchase);
        //then
    assertTrue(printer.isCalled());
    }

    @Test
    public void should_print_the_stub_purchase_when_call_process() {
        //given

        //when

        //then

    }

    @Test
    public void should_verify_with_process_call_with_mockito() {
        //given
        Printer printer=mock(Printer.class);
        Purchase purchase=mock(Purchase.class);
        when(purchase.asString()).thenReturn("TEST");
        CashRegister cashRegister = new CashRegister(printer);
        //when
        cashRegister.process(purchase);
        //then
        verify(printer).print("TEST");
    }

}
