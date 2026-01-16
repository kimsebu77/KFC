package com.kfc.fight.traning;

import com.kfc.fight.busang.ankle;

public class 스트렝스 {
    static void print(){
        System.out.println();
        System.out.println("==============================");
        System.out.println();
        System.out.println("[스트렝스 트레이닝 가이드]");
        System.out.println("목적: 순간적인 힘 발휘 능력 향상");
        System.out.println();
        System.out.println("추천 훈련:");
        System.out.println("- 메디신볼 던지기");
        System.out.println("- 케틀벨 스윙");
        System.out.println("- 저강도 파워 드릴");
        System.out.println("- 샌드백 인터벌");
        System.out.println();
        System.out.println("주의 사항:");
        System.out.println("- 무게보다 동작의 정확성이 중요함");
        System.out.println("- 충분한 휴식 시간 확보");
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
