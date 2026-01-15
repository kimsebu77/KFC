package com.kfc.fight.traning;

import com.kfc.fight.busang.ankle;

public class 정신력 {
    static void print(){
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.println("[정신력 훈련 가이드]");
        System.out.println("목적: 경기 상황에서의 집중력과 안정감 유지");
        System.out.println();
        System.out.println("추천 훈련:");
        System.out.println("- 이미지 트레이닝");
        System.out.println("- 템포 유지 트레이닝");
        System.out.println("- 호흡 명상");
        System.out.println("- 경기 상황 시뮬레이션(쉐도우)");
        System.out.println();
        System.out.println("주의 사항:");
        System.out.println("- 감정을 억누르기보다 인식하고 조절하는 데 집중");
        System.out.println();
        System.out.println("------------------------------");
        System.out.println();
        if(ankle.중증==true){
            System.out.println("현재 부상 상태는 중증입니다.");
            System.out.println("모든 훈련을 중단하고 회복에 집중하세요.");
        }
        else if(ankle.주의=true){
            System.out.println("현재 부상 상태는 주의 단계입니다.");
            System.out.println("훈련은 제한적으로만 진행해야 합니다.");
        } else if (ankle.경미==true) {
            System.out.println("현재 부상 상태는 경미합니다.");
            System.out.println("훈련은 가능하나 강도 조절이 필요합니다.");
        }
        else{
            System.out.println("현재 상태를 확인할 수 없습니다 컨디션에 맞게 훈련하세요");
        }
        System.out.println();
        System.out.println("==============================");
    }
}
