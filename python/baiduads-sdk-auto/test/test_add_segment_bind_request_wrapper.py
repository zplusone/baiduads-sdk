"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.advancedsegmentbind.model.api_segment_batch_request import ApiSegmentBatchRequest
from baiduads.common.model.api_request_header import ApiRequestHeader
globals()['ApiRequestHeader'] = ApiRequestHeader
globals()['ApiSegmentBatchRequest'] = ApiSegmentBatchRequest
from baiduads.advancedsegmentbind.model.add_segment_bind_request_wrapper import AddSegmentBindRequestWrapper


class TestAddSegmentBindRequestWrapper(unittest.TestCase):
    """AddSegmentBindRequestWrapper unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testAddSegmentBindRequestWrapper(self):
        """Test AddSegmentBindRequestWrapper"""
        # FIXME: construct object with mandatory attributes with example values
        # model = AddSegmentBindRequestWrapper()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
