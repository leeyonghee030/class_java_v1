package design.adapter;

// 핵심 (어댑터 클래스)
// 110v 받아서 220v 나가도록 코드를 어떻게 설계야 될까?
public class ElectronicAdapter implements IElectronic220v {

    private IElectronic110v electronic110v;

    public ElectronicAdapter(IElectronic110v iElectronic110v) {
        this.electronic110v = iElectronic110v;
    }

    @Override
    public void connect() {
        // 내부적으로는 100v 의 제폼 connect() 호출 함
        electronic110v.connect();
    }
}
