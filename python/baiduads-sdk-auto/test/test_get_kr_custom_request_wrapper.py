"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.common.model.api_request_header import ApiRequestHeader
from baiduads.kr.model.get_kr_custom_params import GetKRCustomParams
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['GetKRCustomParams'] = GetKRCustomParams
from baiduads.kr.model.get_kr_custom_request_wrapper import GetKRCustomRequestWrapper


class TestGetKRCustomRequestWrapper(unittest.TestCase):
    """GetKRCustomRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testGetKRCustomRequestWrapper(self):
        """Test GetKRCustomRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = GetKRCustomRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
