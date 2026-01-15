package com.kfc.fight.traning;

import com.kfc.fight.busang.ankle;

public class 웨이트 {
    void print(){
        System.out.println("[웨이트 트레이닝 가이드]");
        System.out.println("목적: 근육량 증가 및 관절 안정성 강화");
        System.out.println();
        System.out.println("추천 훈련:");
        System.out.println("- 스쿼트 (자중 또는 저중량)");
        System.out.println("- 푸쉬업");
        System.out.println("- 풀업");
        System.out.println("- 코어 운동 (플랭크)");
        System.out.println();
        System.out.println("주의 사항:");
        System.out.println("- 최대 중량 사용 금지");
        System.out.println("- 반동을 이용한 동작 금지");
        System.out.println("- 정확한 자세 유지");
        System.out.println();
        if(ankle.중증==true){
            System.out.println("현재 부상 상태는 중증입니다.");
            System.out.println("모든 훈련을 중단하고 회복에 집중하세요.");
        }
        else if(ankle.주의=true){
            System.out.println("현재 부상 상태는 주의 단계입니다.");
            System.out.println("훈련은 제한적으로만 진행해야 합니다.");
        } else if (ankle.경미) {
            System.out.println("현재 부상 상태는 경미합니다.");
            System.out.println("훈련은 가능하나 강도 조절이 필요합니다.");
        }
    }
}
